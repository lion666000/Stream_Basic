void main() {

    /*
    List<Integer> list = new ArrayList<>();

    for (int i = 1; i <= 10; i++) {
        list.add(i);
    }

    list.stream()
            .filter(x -> x % 2 == 0)
            .forEach(System.out::println);

     */


    /*
    List<Integer> list = Arrays.asList(10,11,12,13,14,15,16,17,18,19,20);

    list.stream()
            .filter(x -> x % 3 == 0)
            .forEach(System.out::println);

    double avg = IntStream.rangeClosed(10,20)
            .average()
            .orElse(0);
    System.out.println(avg);

     */

    /*
    List<String> names = Arrays.asList("Anna", "Petr");

    List<Integer> lenghts = names.stream().map(String::length).toList();

    System.out.println(lenghts);

    List<String> otherList = names.stream().filter(name -> name.length() >= 4).map(String::toUpperCase).toList();
    System.out.println(otherList);

     */
    /*
    List<String> names = Arrays.asList("Anna", "Petr");

    List<String> firstLetters = names.stream().map(s -> s.substring(0,1)).collect(Collectors.toList());
    System.out.println(firstLetters);


    String collectJoined = names.stream().collect(Collectors.joining(", "));
    System.out.println(collectJoined);

     */

    /*
    List<String> names = Arrays.asList("Anna", "Petr");

    long count = names.stream().filter(n -> n.startsWith("A")).count();
    System.out.println(count);

    boolean containse = names.stream().anyMatch(n -> n.contains("e"));
    System.out.println(containse);


     */

    List<String> names = Arrays.asList("Erb", "Anna", "Petr", "Hafik");

    Optional<String> first = names.stream().filter(n -> n.length() > 3).findFirst();
    System.out.println(first.get());

    Stream<String> longer = names.stream().filter(n -> n.length() > 3).limit(3);
    System.out.println(longer.collect(Collectors.toList()));

}
