public interface LogAppender {
  /**
   * Appends the given log message to the underlying log.
   *
   * @param logMessage the log message to append
   */
  void append(LogMessage logMessage);
}
