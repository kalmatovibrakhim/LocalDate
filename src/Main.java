import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*
        LocalDate date = LocalDate.of(2022,12,25);
        if(date.isBefore(LocalDate.now())){
            System.out.println("Prosrochennyi");
        } else if ((LocalDate.now().plusDays(10)).isAfter(LocalDate.now())){
            System.out.println(LocalDate.now().plusDays(10));
            System.out.println("7 days pros");
        } else if (date.isAfter(LocalDate.now())) {
            System.out.println("Ne prosrochennyi");
        }



//        Integer[] nums = {1,3,4,5,6,7,8,9};
////        Stream.of(nums).forEach(x->System.out.println(x*x));
//        List<Integer> numbers = List.of(10,20,30,45,50,60,73);
////        numbers.stream().map(c->c*2).forEach(System.out::println);
//        numbers.stream().map(c->(c*10)/100d).forEach(x-> System.out.println("%10 is "+x));

        List<Student>students=new ArrayList<>();
        students.add(new Student(1,"asan","asanbekov","asanbaevich",2000));
        students.add(new Student(2,"uson","usonov","usonovich",2001));
        students.add(new Student(3,"kubat","kubatov","kubatovich",1998));

//        students.stream().map(m->LocalDate.now().getYear()-m.getDateOf()).forEach(System.out::println);

//        students.stream().map(c->c.getSurname()).forEach(System.out::println);
//        System.out.println(LocalDate.now().getYear());

        String[] str = {"lya","sdkfsd","kara", "ssdf"};
//        Stream.of(str).map(c->c+c).forEach(System.out::println);

        List<String> surnames = students.stream().map(Student::getSurname).collect(Collectors.toList());
//        System.out.println(surnames);

         */
        
        Integer[] nums = {2,3,4,5,6,7,8,9,10,11};
        List<Integer>numbers2 =new ArrayList<>();
        List<Integer>numbers3 =new ArrayList<>();

        numbers2 = Stream.of(nums).map(c->c%3==0?0:c*10).collect(Collectors.toList());
        System.out.println(numbers2);

        numbers3 = Stream.of(nums)
                .filter(f->f%2==0)
                .map(c->c*c)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(numbers3);
        System.out.println(numbers3.get(numbers3.size()-1));

    }
}