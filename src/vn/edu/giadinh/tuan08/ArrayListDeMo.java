package vn.edu.giadinh.tuan08;
import java.util.ArrayList;
import java.util.List;

import com.dungnv2008110007.tuan07.Circle;
import com.dungnv2008110007.tuan07.Shape;
import com.dungnv2008110007.tuan07.Square;
import com.dungnv2008110007.tuan07.Triangle;


public class ArrayListDeMo {
    public static void main(String[] args) {
        List<Shape> list = new ArrayList<>();
        Square square  = new Square();
        square.setAmThanh("Hinhvuong.AIF");
        Circle circle = new Circle();
        circle.setAmThanh("Hinhtron.AIF");
        Triangle triangle = new Triangle();
        triangle.setAmThanh("Hinhtamgiac.AIF");
        list.add(square);
        list.add(circle);
        list.add(triangle);
        for (Shape shape : list) {
            shape.xoay();
            shape.phatAmThanh();
        }
    }
}
