package com.aakarsh.logger;

import com.aakarsh.logger.model.LogEntry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LoggerController {

  Logger logger = LoggerFactory.getLogger(LoggerController.class);

  @RequestMapping("/sample")
  public String saveSampleLogs() {
    logger.trace("A TRACE Message");
    logger.debug("A DEBUG Message");
    logger.info("An INFO Message");
    logger.warn("A WARN Message");
    logger.error("An ERROR Message");

    return "Generated logs of 5 levels - TRACE, DEBUG, INFO, WARN & ERROR";
  }


  @RequestMapping("/trace")
  public String saveTraceLog(@RequestBody LogEntry entry) {
    return "Logged request body as a TRACE Message";
  }

  @RequestMapping("/debug")
  public String saveDebugLog(@RequestBody LogEntry entry) {
    return "Logged request body as a DEBUG Message";
  }

  @RequestMapping("/info")
  public String saveInfoLog(@RequestBody LogEntry entry) {
    return "Logged request body as a INFO Message";
  }

  @RequestMapping("/warn")
  public String saveWarnLog(@RequestBody LogEntry entry) {
    return "Logged request body as a WARN Message";
  }

  @RequestMapping("/error")
  public String saveErrorLog(@RequestBody LogEntry entry) {
    return "Logged request body as a ERROR Message";
  }
}
