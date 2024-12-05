package a1205.streamEx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300), new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400), new Transaction(mario, 2012, 700), new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));
        // brian, mario ~~은 거래자 // Cambridge ~~ 는 거래자가 근무하는도시

        // 1.문제 2011년도에 일어난 모든 트랜잭션을 찾아 오름차순으로 정렬하시오.
        practice1(transactions);

        // 2. 문제 거래자가 근무하는 모든 도시를 중복없이 나열하시오
        practice2(transactions);

        // 3. 켐브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
        practice3(transactions);

        // 4. 밀라노엔 거래자가 있는가?
        practice4(transactions);

        // 5. 켐브릿지에서 거주하는 거래자의 모든 트랜잭션값을 출력하시오
        practice5(transactions);

        // 6. 모든 거래자의 이름을 알파벳 순으로 정렬해서 반환하시오.
        practice6(transactions);

        // 7. 전체 트랜잭션 중 최댓값은 얼마인가?
        practice7(transactions);

        // 8. 전체 트랜잭션 중 최소값은 얼마인가?
        practice8(transactions);
    }

    // 1.문제 2011년도에 일어난 모든 트렌젝션을 찾아 오름차순으로 정렬하시오.
    private static void practice1(List<Transaction> transactions) {
        List<Transaction> result = transactions.stream() // 리스트를 스트림으로 바꾸는 과정이 필요
                .filter(t -> 2011 == t.getYear())
                // 리스트를 돌면서 t라는 객체를 받아
                .sorted(Comparator.comparing(Transaction::getValue)) // 뽑아서 정렬
                .collect(Collectors.toList());
        System.out.println("문제 1 : " + result);
        // .sorted(Comparator.comparing(Transaction::getValue).reversed())//내림차순
        // .sorted((tran1, tran2) -> Integer.compare(tran1.getValue(),
        // tran2.getValue()))
    }

    // 2. 문제 거래자가 근무하는 모든 도시를 중복없이 나열하시오
    private static void practice2(List<Transaction> transactions) {
        List<String> result = transactions.stream()
                .map((tran) -> tran.getTrader().getCity())
                // tran(transactions) 객체를 입력받아서
                // .map(Transaction::getTrader) //각 거래에서 거래자 객체를 추출
                // .map(Trader::getCity) //각 거래자에서 도시정보추출
                .distinct()
                .collect(Collectors.toList());
        System.out.println("문제 2 : " + result);
    }

    // 3. 켐브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
    private static void practice3(List<Transaction> transactions) {
        List<Trader> result = transactions.stream() // 프렌젝션 꾸러미 받아온다
                .map(Transaction::getTrader)
                .filter(trader -> ("Cambridge").equals(trader.getCity()))
                .distinct() // 중복제거
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());

        System.out.println("문제 3 : " + result); // 최종결과
    }

    // 4. 밀라노엔 거래자가 있는가?
    private static void practice4(List<Transaction> transactions) {
        boolean result = transactions.stream()
                .anyMatch(tran -> "Milan".equals(tran.getTrader().getCity())); // anyMatch는 참거짓을 가져온다
        System.out.println("문제 4 : " + result);
    }

    // 5. 켐브릿지에서 거주하는 거래자의 모든 트랜잭션값을 출력하시오
    private static void practice5(List<Transaction> transactions) {
        List<Transaction> result = transactions.stream()
                .filter(tran -> "Cambridge".equals(tran.getTrader().getCity()))
                .collect(Collectors.toList());
        System.out.println("문제 5 : " + result);
    }

    // 6. 모든 거래자의 이름을 알파벳 순으로 정렬해서 반환하시오.
    private static void practice6(List<Transaction> transactions) {
        String result = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted() // 호출할 때 아무 변수도 전달하지 않으면 기본적으로 전달
                .collect(Collectors.joining(","));
        System.out.println("문제 6 : " + result);
    }

    // 7. 전체 트랜잭션 중 최댓값은 얼마인가?
    private static void practice7(List<Transaction> transactions) {
        Optional<Transaction> result = transactions.stream()
            .max(Comparator.comparing(Transaction::getValue));
            //Optional 은 null이어도 에러없음.
            
        System.out.println("문제 7 : " + result.get().getValue());    // result만 하게되면 객체 전체가 나옴 (System.out.println("문제 7 : " + result))
    }

    // 8. 전체 트랜잭션 중 최소값은 얼마인가?
    private static void practice8(List<Transaction> transactions) {
        Optional<Transaction> result = transactions.stream()
            .min(Comparator.comparing(Transaction::getValue));

        System.out.println("문제 8 : " + result.get().getValue());    // Optional은 get으로 추출된 내용을 꺼내올 수 있다. 7번의 주석과 비교
    }

}