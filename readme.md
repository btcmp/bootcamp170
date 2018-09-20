# Java Android
## Java Main
```java
public static void main(String args[]){
	System.out.println("hello 1 java android");
}
```

## Java Variable
```java
//int ->bilangan bulat
int a = 5;
//String -> string
String name = "gian";
//Array -> untuk menyimpan data lebih dari 1
int[] data = new int[]{1,2};
int[] data2 = new int[2];
```

## Java Method 
```java
/**
 *
 * @author arrizaqu
 */
public class Karyawan {
    //properties
    //nilai default
    String name;
    int age;
    String gender;
    String jobDesc;
    
    //GETTER
    //method / function 
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String gender(){
        return this.gender;
    }
    public String jobDesc(){
        return this.jobDesc;
    }
  
    //setter
    public void setName(String name){ //parameer
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setJobDesc(String jobDesc){
        this.jobDesc = jobDesc;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    public void info(){
        System.out.println("name : "+ this.getName());
        System.out.println("gender : "+ this.gender);
        System.out.println("jobdesc : "+ this.jobDesc());
        System.out.println("age : "+ this.age);
    }
    public static void main(String[] args) {
        Karyawan k = new Karyawan();   
        k.setName("abdul rahman");
        k.info();
    }
}
```

## Array VS Variable 
```java
public class MyArray {
    String country;
    //array
    String[] cities;
    String[][] propinsi;
    public void process(){
        this.country = "Indonesia";
        this.country = "India";
        //Array single dimention
        this.cities = new String[3];
        cities[0] = "jakarta";
        cities[1] = "solo";
        cities[2] = "palembang";
        
        this.propinsi = new String[2][4];
        //anggap0 = jakarta
        
        this.propinsi[0][0] = "jakarta selatan";
        this.propinsi[0][1] = "jakarta barat";
        //anggap1 = surabaya
        this.propinsi[1][0] = "surabaya selatan";
        this.propinsi[1][1] = "surabaya barat";
        
        //output : 
        System.out.println("country : "+ this.country);
        //extract 1
        for(int i = 0; i < cities.length; i++){
            System.out.println("cities : "+ this.cities[i]);
        }
        
        //extract 2
        for(int i = 0; i < this.propinsi.length; i++){
            for(int j = 0; j < this.propinsi[i].length; j++){
                System.out.println("cities 2 : "+ this.propinsi[i][j]);
            }
        }
    }
    
    
    public static void main(String[] args) {
        MyArray ma = new MyArray();
        ma.process();
    }
}
```

## Looping
```java
public class MyLoop {
    int input;
    public void execute(int input){ //parameter
        this.input = input;
        //siapkah i 
        for (int i =0, j = 0; i < input; i++, j = j + 2) { 
            System.out.print(i + j +"*\t");
            /*
                0 + 0  = 0;
                1 + 2  = 3;
                2 + 4  = 6;
                3 + 6  = 9
            */
        }
        
        //i++
    }
    
    public void execute2(int n){
        int index  = 0;
        int index2 = 0; //bilangan genap
        int index3 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print((index + index3 - index2) + "\t");
           index = index + 1;
           index2 = index2 + 2;
           index3 = index3 + 5;
        }
        /*
            i   index  index2  index3 ? (index + index3 - index2)
            0   0       0      1        1
            1   1       2      6        5
            2   2       4      11       9
            3   3       6      16       13
        */
    }
    
    public void execute3(int n){
        //double for
        int index1 = 0;
        for (int i = 0; i < n; i++) {
            int index2 = 0;
            for (int j = 0; j < n; j++) {
                int index3 = 0;
                for (int k = 0; k < 10; k++) {
                    System.out.println
        ("index 1 : "+ index1 + ", index 2 : "+ index2 + ", index 3 :"+ index3);
                    index3 = index3 + 1;
                }
                
                index2 = index2 + 1;
            }
            index1 = index1 + 1;
        }
    }
    
    public void execute4(int n){
        int index = n;
        for (int i = 0; i < n; i++) {
            System.out.print(""+ (index = index - 1) + "\t");
        }
    }
    
    //getting data increment by 1, [1,2,3,4..n]
    public int[] execute5(int n){
        int[] data = new int[n];
        int index = 1;
        for (int i = 0; i < n; i++) {
            data[i] = index;
            index++;
        }
        return data;
    }
    
    public int[] execute6(int n){
        int[] data = new int[n];
        int max = n;
        for (int i = 0; i < n; i++) {
            data[i] = max;
            max = max - 1;
        }
        return data;
    }
    
    //output : 1, 4, 9, 16 .. n
    public int execute7(int n ){
        int hasil = 0;
        int index = 1;
        for(int i = 0; i < n; i++){
            hasil = index * index; 
            index++;
        }
        return hasil;
    }
    
    public static void main(String[] args) {
        MyLoop loop = new MyLoop();
        int hasil = loop.execute7(2);
        System.out.println("hasil pangkat : "+ hasil);
        int[] data = loop.execute5(9); //argument
        int[] data1 = loop.execute6(9);        
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(data1));
    }
}
```
