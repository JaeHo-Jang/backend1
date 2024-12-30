package 예약시스템_프로젝트;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Reservation {
    private long id; // 예매번호
    private long busId; // 버스 대표값
    private String busname; // 버스 제목
    private String seatName; // 좌석명

    public long getId() {
        return id;
    }

    public long getbusId() {
        return busId;
    }

    public String getbusname() {
        return busname;
    }

    public String getSeatName() {
        return seatName;
    }

    private static final File file = new File(
            "C:\\Users\\YONSAI\\Desktop\\jaeho\\vsjava\\java\\src\\bus\\reservation.txt");

    public Reservation(long id, long busId, String busname, String seatName) {
        this.id = id;
        this.busId = busId;
        this.busname = busname;
        this.seatName = seatName;
    }

    public Reservation(long busId, String busname, String seatName) {
        this.id = Instant.now().toEpochMilli(); // 예약 대표값(id) 현재시간을 밀리세컨드로 바꾼값으로 입력 중복 방지
        this.busId = busId;
        this.busname = busname;
        this.seatName = seatName;
    }

    public String toString() {
        return String.format("버스: %s, 좌석: %s", busname, seatName);
    }

    public static ArrayList<Reservation> findBybusId(String busIdStr) throws IOException {
        ArrayList<Reservation> reservations = new ArrayList<Reservation>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;

        while ((line = br.readLine()) != null) {
            String[] temp = line.split(",");
            if (busIdStr.equals(temp[1])) { // 대표값이 같은 예매된 버스만 조회
                long id = Long.parseLong(temp[0]); // 예매 발급번호
                long busId = Long.parseLong(temp[1]); // 예매 버스 대표값
                String busname = temp[2]; /// 버스 이름
                String seaName = temp[3]; // 좌석명
                Reservation r = new Reservation(id, busId, busname, seaName);
                reservations.add(r); // 생성 객체를 ArrayList에 추가
            }
        }
        br.close();// 입력 흐름 해제
        return reservations; // 예매 객체를 담은 ArrayList 반환
    }

    public void save() throws IOException {
        FileWriter fw = new FileWriter(file, true); // 이어쓰기(append) 모드 설정(true)
        fw.write(this.toFileString() + "\n");
        fw.close();
    }

    private String toFileString() {
        return String.format("%d,%d,%s,%s", id, busId, busname, seatName);
    }

    public static Reservation cancel(String reservationId) throws IOException {
        Reservation canceled = null;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String text = "";
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] temp = line.split(",");
            if(reservationId.equals(temp[0])){
                canceled = new Reservation(
                    Long.parseLong(temp[0]), //발급번호
                    Long.parseLong(temp[1]), // 버스 대표값
                    temp[2], // 버스 이름
                    temp[3]  // 좌석명
                );
                continue;  // 다음반복으로 넘어감(복사되지 않게)
            }
            text += line + "\n";  // 읽은 문자열을 누적하여 복사
        }
        br.close(); //입력 흐름 해제
        FileWriter fw = new FileWriter(file); // FileWriter 객체 생성(덮어쓰기 모드)
        fw.write(text); // 파일 출력
        fw.close(); // 출력 흐름 해제
        return canceled; // 삭제된 예매를 객체로 반환
    }

    public static Reservation findById(String reservationId) throws IOException{
        Reservation r  = null;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;

        while ((line = br.readLine()) != null){
            String[] temp = line.split(",");
            if(reservationId.equals(temp[0])){
                r = new Reservation(
                    Long.parseLong(temp[0]), //발급번호
                    Long.parseLong(temp[1]), // 버스 대푯값
                    temp[2], // 버스 제목
                    temp[3] // 좌석명
                );
                break; //반복탈출
            } 
        }
        br.close(); //입력 흐름 해제
        return r;
    }

}
