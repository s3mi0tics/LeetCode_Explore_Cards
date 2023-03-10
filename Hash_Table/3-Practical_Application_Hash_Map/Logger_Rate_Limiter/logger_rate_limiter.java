class Logger {
    Map<String, Integer> logger;
    public Logger() {
         logger = new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        
        if (logger.containsKey(message) && timestamp < logger.get(message) + 10 ) {
            return false;
        }
            logger.put(message, timestamp);
            return true;
    }
}