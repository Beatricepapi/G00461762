package ie.atu.sample.model;

import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.Getter;
import lombok.Setter;

@Table(name = "students")
public class Student {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Setter
    @Getter
    private String name;

    @ManyToOne @JoinColumn(name:"room_id")
    @Getter
    @Setter
    private Category roomId;

    public Student() {}

    public Student(Long id, String name, Category roomId) {
        this.id = id;
        this.name = name;
        this.roomId = roomId;
    }
}
