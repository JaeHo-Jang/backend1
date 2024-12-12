    package 예약시스템_프로젝트;

    import java.io.BufferedReader;
    import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
    import java.io.FileWriter;
    import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
    import java.util.ArrayList;

    public class Bus {
        private long id;
        private String name; // 열차 이름
        private String arrive; // 행선지

        public Bus(String name, String arrive) {
            this.id = Instant.now().getEpochSecond(); // 타임스탬프
            this.name = name;
            this.arrive = arrive;
        }

        public String getname() {
            return name;
        }

        public String getarrive() {
            return arrive;
        }

        private static final File file = new File(
                "C:\\Users\\YONSAI\\Desktop\\jaeho\\vsjava\\java\\src\\bus\\Bus.txt");

        public Bus(long id, String name, String arrive) {
            this.id = id;
            this.name = name;
            this.arrive = arrive;
        }

        @Override
        public String toString() {
            return String.format("[%d] : %s(%s)", id, name, arrive);
        }

        public static ArrayList<Bus> findAll() throws IOException {
            ArrayList<Bus> buses = new ArrayList<Bus>();
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            String line = null;
            while ((line = br.readLine()) != null) { // 파일을 한행씩 읽어와 반복 - 데이터가 있을때까지
                // 콤마(,)로 배열로 나눠서 지정할 수 있는 메소드 = split
                String[] temp = line.split(","); // 콤마를 기준으로 배열을 나누겠다.
                Bus m = new Bus(
                        Long.parseLong(temp[0]),
                        temp[1], // 열차 이름
                        temp[2]); // 행선지
                buses.add(m); // 생성 버스 객체를 ArrayList에 추가
            }
            br.close();// 파일 입력 흐름 해제
            return buses; // 버스 객체가 담긴 ArrayList 반환
        }

        public static Bus findById(String busIdStr) throws IOException {
            Bus bus = null;
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) { // 파일을 한행씩 읽어와 반복 - 데이터가 있을때까지
                String[] temp = line.split(","); // 콤마를 기준으로 배열을 나누겠다.
                if (busIdStr.equals(temp[0])) { // 버스대표값을 찾으면 객체 생성
                    bus = new Bus(Long.parseLong(temp[0]),
                            temp[1], // 제목
                            temp[2]); // 행선지
                    break; // 반복문 탈출(더이상 찾지 않음)
                }
            }
            br.close();// 파일 입력 흐름 해제

            return bus;
        }

        public void save() throws IOException {
            FileWriter fw = new FileWriter(file, true);
            // 이어쓰기(append) 모드 설정 (true)
            fw.write(this.toFileString() + "\n");
            fw.close();
        }

        // 객체정보를 문자열로 변환
        private String toFileString() {
            return String.format("%d,%s,%s", id, name, arrive);
        }

        public static void delete(String busIdStr) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String text = "";
            String line = null;

            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                if (busIdStr.equals(temp[0])) {// 삭제 대상값을 찾으면
                    continue; // 다음 반복으로 넘어감(복사되지 않게)
                }
                text += line + "\n"; // 읽은 문자열을 누적하여 복사
            }
            br.close(); // 입력 흐름 해제
            FileWriter fw = new FileWriter(file); // FileWriter 객체 생성(덮어쓰기 모드)
            fw.write(text); // 파일 출력
            fw.close(); // 출력 흐름 해제
        }
    }
