package n2s.ehc;

public class UserExceptions {
    static class InvalidEntry extends Exception{
        public InvalidEntry(String message) {
            super(message);
        }
    }

    static class InvalidUserId extends Exception{
        public InvalidUserId(String message) {
            super(message);
        }
    }

    static class UserIdNotFound extends Exception{
        public UserIdNotFound(String message) {
            super(message);
        }
    }
}
