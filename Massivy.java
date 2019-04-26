public class Massivy {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0};//меняем единицы и нули (задание 1)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("Полученный 1 массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
                   }
        System.out.println();
        System.out.println("Полученный 2 массив:");    //создаем массив делителей 3 (задание 2)
        int[] arr1 = new int[8];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 3*i;}
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};//удваиваем элементы меньшие 6 (задание 3)
        for (int i=0;i<arr2.length;i++){if(arr2[i]<6){arr2[i]=arr2[i]*2;}
        }
        System.out.println("Полученный 3 массив:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");}
           int [][] arr3=new int[4][4];
        for (int i=0;i<4;i++){            // создаем матрицу (задание 4)
            for (int j=0;j<4;j++){
                arr3[i][j]=i+j;
            }
        }
        System.out.println();
        System.out.println("Полученный 4 массив:");
        for (int i=0;i<4;i++){          // меняем на единицы элементы диагонали
            for (int j=0;j<4;j++){
               if(i==j){arr3[i][j]=1;}
               System.out.print(arr3[i][j]);
            }
            System.out.println();
        }
        int[] arr4= {2, -9, 4, 0, 167, 234, -78, 1, 5, 1, 9, -98, 0};  // находим максимальный и минимальный элементы (задание 5)
        int max=arr4[1];
        int min=arr4[1];
        for (int i=1;i<arr4.length;i++){
            if (arr4[i]>max){max=arr4[i];}
            if (arr4[i]<min) {min=arr4[i];}
        }
        System.out.println("Максимальный элемент"+max);
        System.out.println("Минимальный элемент"+min);
    }

        }



