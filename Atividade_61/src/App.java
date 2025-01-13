
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        

        List< Integer > list = Arrays.asList(1,2,3,4,5,6);

        Stream <Integer> st1 = list.stream().map(x -> x * 10);//forma de transformar uma lista em stream (* o map aplica uma função a cada elemento da lista) nesse caso multiplicando por 10          
        System.out.println(Arrays.toString(st1.toArray()));//forma de iprimir a lista usando stream



        Stream <String> st2 = Stream.of("maria","Alex", "bob");//criando uma stream de String
        System.out.println(Arrays.toString(st2.toArray()));

        Stream <Integer> st3 = Stream.iterate(0, x -> x + 2);//a cada elemento da stream é adicionado 2 assim ficando ininito 
        System.out.println(Arrays.toString(st3.limit(10).toArray()));//imprime a lista limitando ela de 10 caracteres (porem se eu so colocar o to array ele vai imprimir infinitamente porque sempre vai gerar um novo valor para a stream)
        
        Stream < Long > st6 = Stream.iterate(new Long[] {0L,1L},p -> new Long[] {p[1],p[0]+p[1]}).map(p -> p[0]);//mt variado o que pode fazer 
        System.out.println(Arrays.toString(st6.limit(10).toArray()));


        int sum = list.stream().reduce(0,(x,y)->x+y);
        System.out.println("A soma vai ser igual a: "+sum);



        //pega elementos pares da lista e multiplica por 10 
        List<Integer> lst2 = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
        System.out.println(Arrays.toString(lst2.toArray()));                      
                                   
                                    
        







       
        
       
    }
}
