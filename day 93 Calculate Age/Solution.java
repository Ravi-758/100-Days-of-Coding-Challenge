import java.time.Period;
import java.time.LocalDate;
class ageCal{
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(2001,5,27);
        int years = Period.between(birthDate,today).getYears();
        System.out.println("Today Date:-"+today);
        System.out.println("Birth Date:-"+birthDate);
        System.out.println("Your Age is:-"+years);
    }
}
