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