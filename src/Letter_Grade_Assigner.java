public class Letter_Grade_Assigner {
    public static void main(String[]args){
        int[] scores={101, 61, 92, 82, 70, 29};
        char grade;

        for( int i= 0; i<scores.length; i++){
            if(scores[i]>100 || scores[i]<0){
                System.out.println("Student with "+scores[i]+" marks have invalid marks");
            }else if(scores[i]>=90 && scores[i]<=100){
                grade='A';
                System.out.println("Student with "+scores[i]+" marks, Grade: "+grade);
            }else if(scores[i]<90 && scores[i]>=80){
                grade='B';
                System.out.println("Student with "+scores[i]+" marks, Grade: "+grade);
            }else if(scores[i]<80 && scores[i]>=70){
                grade='C';
                System.out.println("Student with "+scores[i]+" marks, Grade: "+grade);
            }else if(scores[i]<70 && scores[i]>=60){
                grade='D';
                System.out.println("Student with "+scores[i]+" marks, Grade: "+grade);
            }else{
                grade='F';
                System.out.println("Student with "+scores[i]+" marks, Grade: "+grade);
            }
        }
    }
}
