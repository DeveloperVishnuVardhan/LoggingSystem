public class Logger {
  public LoggerConfig config;
  private static final Logger instance = new Logger();

  private Logger() {
    this.config = new LoggerConfig(LogLevel.INFO, new ConsoleAppender());
  }

  public static Logger getInstance() {
    return instance;
  }

  public void log(LogLevel logLevel, String message) {
    LogMessage logMessage = new LogMessage(logLevel, message);
    config.getLogAppender().append(logMessage);
  }

  public void debug(String message) {
    log(LogLevel.DEBUG, message);
  }

  public void info(String message) {
    log(LogLevel.INFO, message);
  }

  public void warning(String message) {
    log(LogLevel.WARNING, message);
  }

  public void error(String message) {
    log(LogLevel.ERROR, message);
  }

  public void fatal(String message) {
    log(LogLevel.FATAL, message);
  }

  public void setConfig(LoggerConfig config) {
    this.config = config;
  }
}
