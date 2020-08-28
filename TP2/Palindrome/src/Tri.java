public class Tri {
        public static void main(String[] args) {
            int[] tab = { 4, 7, 3, 9, 1, 2, 5 };

            System.out.println("Hello World !!!");
            System.out.println("------- Exécution de la fonction---------");
            // display(t1);
            // display(right(t1));
            // display(merge(1,t1));
            // display(merge(t1, t2));
            // display(extract(tab, Integer.parseInt(args[0]), Integer.parseInt(args[1])));
            display(mergeSort(tab));
            System.out.println("\n------- Fin d'exécution---------");
        }

        static void display(int[] tab) {
            for (int num : tab) {
                System.out.print(num + ", ");
            }
            System.out.print("\n");

        }

        static int[] right(int[] tab) {
            int[] mytab = new int[tab.length - 1];
            for (int i = 0; i < tab.length - 1; i++) {
                mytab[i] = tab[i + 1];
            }
            return mytab;
        }

        static int[] merge(int val, int[] tab) {
            int[] mytab = new int[tab.length + 1];
            mytab[0] = val;
            for (int i = 0; i < tab.length; i++) {
                mytab[i + 1] = tab[i];
            }
            return mytab;
        }

        static int[] merge(int[] tab1, int[] tab2) {

            while (true) {
                if (tab1.length == 0) {
                    int[] mytab = new int[tab2.length];
                    mytab = tab2;
                    return mytab;
                } else if (tab2.length == 0) {
                    int[] mytab = new int[tab1.length];
                    mytab = tab1;
                    return mytab;
                } else if (tab1[0] <= tab2[0]) {
                    int[] mytab = new int[tab1.length + tab2.length];
                    int[] temp = merge(tab1[0], right(tab1));
                    int next = 0;
                    for (int i = 0; i < tab1.length; i++) {
                        mytab[i] = temp[i];
                        next++;
                    }
                    for (int i = 0; i < tab2.length; i++) {
                        mytab[next + i] = tab2[i];
                    }

                    return mytab;
                } else if (tab2[0] <= tab1[0]) {
                    int[] mytab = new int[tab1.length + tab2.length];
                    int[] temp = merge(tab2[0], right(tab2));
                    int next = 0;
                    for (int i = 0; i < tab2.length; i++) {
                        mytab[i] = temp[i];
                        next++;
                    }
                    for (int i = 0; i < tab1.length; i++) {
                        mytab[next + i] = tab1[i];
                    }

                    return mytab;
                } else {
                    int[] mytab = new int[5];
                    return mytab;
                }

            }
        }

        static int[] extract(int[] tab, int start, int end) {
            int[] mytab = new int[tab.length];
            int i = 0;
            // for (int i=0; i<end-1; i++) {
            while (start < end) {
                mytab[i] = tab[start];
                i++;
                start++;
            }
            int[] cleantab = new int[start];
            i = 0;
            while (mytab[i] != 0) {
                cleantab[i] = mytab[i];
                i++;
            }
            return cleantab;
        }

        static int[] mergeSort(int[] tab) {
            int[] mytab = tab;
            int[][] cleantab = new int[mytab.length][1];

            while (true) {

                if (mytab.length != 1) {

                    // mytab = right(tab);
                    cleantab[i] = mytab = extract(mytab, 0, mytab.length / 2);
                    System.out.println(mytab[0]);

                } else {
                    // mytab = merge(mytab,tab);
                    // cleantab[i] = mytab;
                    // System.out.println(cleantab);
                    return mytab;
                }

            }

        }
    
}