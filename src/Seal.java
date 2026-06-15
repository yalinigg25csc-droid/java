public class Seal {

    sealed interface LoginResult
            permits LoginSuccess, LoginFailure, LoginLoading {
    }

    record LoginSuccess(String username)
            implements LoginResult {
    }

    record LoginFailure(String reason)
            implements LoginResult {
    }

    record LoginLoading(String message)
            implements LoginResult {
    }

    public class Main {

        static void handleLogin(LoginResult result) {

            if (result instanceof LoginSuccess success) {
                System.out.println("Login Success : " + success.username());

            } else if (result instanceof LoginFailure failure) {
                System.out.println("Login Failed : " + failure.reason());

            } else if (result instanceof LoginLoading loading) {
                System.out.println("Login Loading : " + loading.message());
            }
        }

        public static void main(String[] args) {

            LoginResult success =
                    new LoginSuccess("Admin");

            LoginResult failure =
                    new LoginFailure("Invalid Password");

            LoginResult loading =
                    new LoginLoading("Please Wait...");

            handleLogin(success);
            handleLogin(failure);
            handleLogin(loading);
        }

    }
}




