/**
 * This class represents a log message.
 */
public class LogMessage {
  private final LogLevel logLevel;
  private final long timestamp;
  private final String message;

  public LogMessage(LogLevel logLevel, String message) {
    this.logLevel = logLevel;
    this.timestamp = System.currentTimeMillis();
    this.message = message;
  }

  /**
   * Returns the log level associated with this log message.
   *
   * @return the LogLevel of this log message
   */
  public LogLevel getLogLevel() {
    return logLevel;
  }

  /**
   * Retrieves the timestamp associated with this log message. The timestamp
   * is specified in milliseconds since the Unix epoch.
   *
   * @return the timestamp associated with this log message
   */
  public long getTimestamp() {
    return timestamp;
  }

  /**
   * Retrieves the log message associated with this log message.
   *
   * @return the message associated with this log message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Converts this log message into a string, in the format
   * "<i>logLevel</i> - <i>timestamp</i> - <i>message</i>".
   *
   * @return a string representation of the log message
   */
  @Override
  public String toString() {
    return String.format("%s - %s - %s", logLevel.toString(), timestamp, message);
  }
}
