import javax.swing.*;

public class GUIApplication {
    public static int likeCounter = 1099998;
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        JFrame window = new JFrame("My first GUI");
               window.setSize(500, 500);
               window.show();

        JButton btn = new JButton("Like");
               window.getContentPane().add(btn);

               btn.addActionListener(
                       e -> {
                           likeCounter++;
                           System.out.println("You have clicked!");
                           btn.setText(likeFormat(likeCounter));
                       }
               );
    }

    public static String likeFormat(int likeCounter) {
        if (likeCounter < 1000){
            return likeCounter + " Likes";
        }
        else if ( (likeCounter >= 1000) && (likeCounter < 1000000) ) {
            Double divK = Double.valueOf(likeCounter) / 1000;
            String divKString = String.valueOf(divK);
            String[] divKStringArray = divKString.split("\\.");
            if (divKStringArray[1].charAt(0) == '0') {
                return divKStringArray[0] + "k Likes";
            }
            else {
                return divKStringArray[0] + "." + divKStringArray[1].charAt(0) + "k Likes";
            }
        }
        else if (likeCounter >= 1000000) {
            Double divM = Double.valueOf(likeCounter) / 1000000;
            String divMString = String.valueOf(divM);
            String[] divMStringArray = divMString.split("\\.");
            if (divMStringArray[1].charAt(0) == '0') {
                return divMStringArray[0] + "M Likes";
            }
            else {
                return divMStringArray[0] + "." + divMStringArray[1].charAt(0) + "M Likes";
            }
        }
        return "";
    }
}
