void main() {
    List<Integer> list = new ArrayList<>();

    for (int i = 1; i <= 10; i++) {
        list.add(i);
    }

    list.stream()
            .filter(x -> x % 2 == 0)
            .forEach(System.out::println);
}
