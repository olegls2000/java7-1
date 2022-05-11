package bte.model.simple;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class Log {
    private String type;
    private int count;

    public Log(String type, int count) {
        this.type = type;
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Log{" +
                "type='" + type + '\'' +
                ", count=" + count +
                '}';
    }

    public static void main(String[] args) {

        List<Log> logs = List.of(
                new Log("Сибирская сосна", 10),
                new Log("Дуб монгольский", 30),
                new Log("Берёза карликовая", 5));

        Stream<Log> stream = logs.stream();
        Stream<Log> filteredStream = stream.filter(x -> x.getCount() > 7)
                .filter(x -> !"Дуб монгольский".equalsIgnoreCase(x.getType()));

        filteredStream.forEach(x -> System.out.println(x.getType()));

        Stream<String> stringStream = Stream.of("asd", "aaa", "bbb");
        Stream.concat(Stream.of("aaa", "bbb", "ccc"), Stream.of("111", "222", "333"))
                .forEach(System.out::println);

        final Stream.Builder<Object> builder = Stream.builder();
        final Stream<Object> empty = Stream.empty();

        Stream.generate(() -> Math.random()).limit(10).forEach(System.out::println);

     /*   new Random().ints()
        new Random().doubles()
        new Random().longs() */

        final LongStream longs = new Random().longs();
        longs.limit(10)
                .filter(x -> x > 0)
                .map(i -> i * 2)
                .forEach(System.out::println);


        List.of("a", "b", "c").stream().forEach(System.out::println);

        List<Log> logs2 = List.of(
                new Log("Сибирская сосна", 10),
                new Log("Дуб монгольский", 30),
                new Log("Берёза карликовая", 5));
        logs2.stream().map(x -> x.getType()).forEach(System.out::println);
        System.out.println();

        logs2.stream().map(Log::getType).map(x -> x.split(" "))
                .forEach(System.out::println);

        final List<String[]> collect = logs2
                .stream()
                .map(Log::getType)
                .map(x -> x.split(" "))
                .collect(Collectors.toList());
        System.out.println();

        for (String[] ss : collect) {
            for (String s : ss) {
                System.out.println(s);
            }

        }
        System.out.println();

        logs2
                    .stream()
                    .map(Log::getType)
                    .flatMap(x -> Stream.of(x.split(" ")))  //!
                    .forEach(System.out::println);
        System.out.println();

        logs2
                .stream()
                .map(Log::getType)
                .map(x -> x.split(" "))
                .flatMap(x -> Arrays.stream(x))                     //!
                .forEach(System.out::println);


        logs2.stream().map(Log::getType)
                .map(x -> x.split(" ")).flatMap(Arrays::stream)
                .map(String::chars).forEach(System.out::println);

        IntStream chars = logs2
                .stream()
                .map(Log::getType)
                .map(x -> x.split(" "))
                .flatMap(Arrays::stream)
             //   .map(x->x.chars())   //?
             //.flatMapToInt(x -> x);
                .flatMapToInt(x -> x.chars());

                chars.forEach(x1 -> System.out.println((char)x1));

      logs2.stream()
              .map(Log::getType)
              .map(x -> x.split(" "))
              .flatMap(Arrays::stream)
              .map(String::chars)
              .flatMapToInt(x -> x)
              .distinct()
              .limit(5)
              .sorted();

        new Random()
                .ints()
                .takeWhile(x -> x % 7 != 0)
                .forEach(i -> System.out.print(i + " "));

        final int reduce = new Random()
                .ints(100)
                .reduce(0, (x, y) -> x + y);


        List<Integer> ints = new Random().ints(100)
                .boxed() // оборачиваем, так как коллекции не работают с примитивами
                .reduce(new ArrayList<>(),
                        (ArrayList<Integer> x, Integer y) -> {
                            x.add(y);
                            return x;
                        },
                        (a, b) -> {
                            a.addAll(b);
                            return a;
                        });

        List<Integer> ints2 = new Random().ints(100)
                .boxed()
                .collect(Collectors.toList());

        final IntStream chars2 = logs2
                .stream()
                .map(Log::getType)
                .map(x -> x.split(" "))
                .flatMap(Arrays::stream)
                .flatMapToInt(x -> x.chars());

        final Map<Character, Integer> collect1 = chars2
                .boxed()  //?
                .collect(Collectors.toMap(x -> (char) x.intValue(), x -> 1, Integer::sum));


        IntStream chars3 = logs2
                .stream()
                .map(Log::getType)
                .map(x -> x.split(" "))
                .flatMap(Arrays::stream)
                .flatMapToInt(x -> x.chars());

        final Map<Boolean, List<Integer>> collect2 = chars3
                .boxed()
                .collect(Collectors.partitioningBy(Character::isLowerCase));


    }
}
