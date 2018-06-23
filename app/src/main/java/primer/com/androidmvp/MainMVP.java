package primer.com.androidmvp;

public interface MainMVP {

   interface view {
        void displayToastMessage();
    }

   interface presenter{
        void clickedToastButton();
    }
}
