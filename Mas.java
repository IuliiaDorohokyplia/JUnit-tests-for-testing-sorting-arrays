

public class Mas {
    int arrayForSorting[];

    public Mas() {
        this.arrayForSorting = new int[20];
        for (int i=0;i<arrayForSorting.length;i++){
            this.arrayForSorting[i] =(int)(Math.random() * 20);
        }
    }


    public Mas(int[] arrayList) {
        this.arrayForSorting = arrayList;
    }


    public void outArray() {
        System.out.println("");
        for (int i = 0; i < this.arrayForSorting.length; i++) {
            System.out.print(this.arrayForSorting[i]+" ");
        }
        System.out.println("");
    }


    public int[] sortBubble(int[] arrayList) {
        int temp;
        for(int i=0;i<arrayList.length;i++){
            for (int j=arrayList.length-1;j>i;j--){
                if(arrayList[j-1]>arrayList[j]){
                    temp=arrayList[j-1];
                    arrayList[j-1]=arrayList[j];
                    arrayList[j]=temp;
                }
            }
        }
        return arrayList;
    }


    public int[] ShakerSort(int[] arrayList){
        //int k = arrayList.length-1;
        int lb=0;
        int ub = arrayList.length-1;
        int x;
        do {
            for(int j=ub; j>lb; j-- ) {
                if ( arrayList[j-1] > arrayList[j] ) {
                    x=arrayList[j-1];
                    arrayList[j-1]=arrayList[j];
                    arrayList[j]=x;
                }
            }
            lb ++;
            for (int j=lb; j<=ub; j++) {
                if ( arrayList[j-1] > arrayList[j] ) {
                    x=arrayList[j-1];
                    arrayList[j-1]=arrayList[j];
                    arrayList[j]=x;
                }
            }
            ub--;
        }
        while ( lb < ub );
        return arrayList;
    }
}
