public class PumpkinFestival {
    public String calculatePrize(int age, int pumpkinsCarved) {
        if (checkLessThanZero(age) || (checkLessThanZero(pumpkinsCarved))) return "Đầu vào không hợp lệ";

        if (checkTooYoung(age)) return "Chưa đủ tuổi";

        if (pumpkinsCarved == 0) return "Không có kẹo";

        if (age >= 5 && age <= 10) {
            if (pumpkinsCarved >= 1 && pumpkinsCarved <= 5) {
                return "Được thưởng 20 kẹo";
            } else if (pumpkinsCarved >= 6 && pumpkinsCarved <= 15) {
                return "Được thưởng 30 kẹo";
            } else {
                return "Được thưởng 50 kẹo";
            }
        }
        else if (age >= 11 && age <= 19) {
            if (pumpkinsCarved >= 1 && pumpkinsCarved <= 15) {
                return "Được thưởng 20 kẹo";
            } else {
                return "Được thưởng 30 kẹo";
            }
        }

        return pumpkinsCarved >= 16 ? "Được thưởng 25 kẹo" : "Được thưởng 15 kẹo";
    }

    //Kiểm tra biến có nhỏ hơn 0 hay không
    private boolean checkLessThanZero(int entity) {
        return entity < 0;
    }

    //Kiểm tra trẻ nhỏ có được dự thi hay không
    private boolean checkTooYoung(int age) {
        return age < 5;
    }
}
