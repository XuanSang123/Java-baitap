package Session6;

public class BT2 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("First StringBuilder: " + sb);

        sb.append("World");
        System.out.println("Sau khi nối thêm:" + sb);

        sb.insert(5, "beautiful");
        System.out.println("Sau khi chèn: " + sb);

        sb.replace(6, 15, "Earth");
        System.out.println("Sau khi thay thế: " + sb);

        sb.delete(5, 15);
        System.out.println("Sau khi xóa: " + sb);

        System.out.println("Độ dài của chuỗi: " + sb.length());

        sb.reverse();
        System.out.println("Sau khi đảo ngược: " + sb);
    }
}
