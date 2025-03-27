/** This class allows to fix the config of the logger. */
public class LoggerConfig {
  private LogLevel logLevel;
  private LogAppender logAppender;

  public LoggerConfig(LogLevel logLevel, LogAppender logAppender) {
    this.logLevel = logLevel;
    this.logAppender = logAppender;
  }

  /**
   * Retrieves the current log level configuration.
   *
   * @return the current LogLevel
   */
  public LogLevel getLogLevel() {
    return logLevel;
  }

  /**
   * Retrieves the current log appender configuration.
   *
   * @return the current log appender
   */
  public LogAppender getLogAppender() {
    return logAppender;
  }

  /**
   * Changes the current log level configuration.
   *
   * @param logLevel the desired LogLevel
   */
  public void setLogLevel(LogLevel logLevel) {
    this.logLevel = logLevel;
  }

  /**
   * Sets the log appender configuration to the specified value.
   *
   * @param logAppender the desired log appender
   */
  public void setLogAppender(LogAppender logAppender) {
    this.logAppender = logAppender;
  }
}
