import java.util.Arrays;

public class Words {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";
// To solve this task at first  I converted  all of the  letters to lower case in order to check every letters

        String[] words = text.toLowerCase().split(" ");
        for (int i = 0; i < words.length; i++)
        {
            words[i] = words[i].replace(",", "")
                    .replace("`", "")
                    .replace(";", "")
                    .replace("?", "");
        }

        bubbleSort(words);
        System.out.println(Arrays.toString(words));
    }

    public static void bubbleSort(String[] words) {
        int n = words.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
//here is bubble sort method
            for (int j = 0; j < n - i - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}
