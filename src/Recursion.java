public class Recursion {

// O(n) runtime


        public static int recursiveSearch(String item, String[] items, int index) {

            if (index >= items.length) {
                return -1;
            }

            if (items[index].equals(item)) {
                return index;
            }


            return recursiveSearch(item, items, index + 1);
        }

        public static void main(String[] args) {
            String[] items = {"hey", "there", "you"};
            String itemToFind = "hey";

            int result = recursiveSearch(itemToFind, items, 0);
            System.out.println(result);
        }
    }


