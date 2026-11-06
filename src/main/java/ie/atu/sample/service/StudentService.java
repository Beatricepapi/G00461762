package ie.atu.sample.service;

import ie.atu.sample.model.Room;
import ie.atu.sample.model.Student;
import ie.atu.sample.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private final RoomRepository roomRepository;

    public StudentService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Student> byRoom(Room room) {
        List<Student> students = new ArrayList<>();
        return students;
    }

    public List<Room> findAll() {
        List<Room> rooms = new ArrayList<>();
        return rooms;
    }

    public List<Room> findByName(String name) {
        List<Room> rooms = new ArrayList<>();
        return rooms;
    }

    public List<Room> findByRoomName(String name) {
        List<Room> rooms = new ArrayList<>();
        return rooms;
    }

    public Student save(Student student) {
        return null;
    }

    public Room save(Room room) {
        return null;
    }

    public Student create(Student student) {
        return null;
    }

    public Room create(Room room) {
        return null;
    }

    public Room update(Room room) {
        return null;
    }

    public Room delete(Room room) {
        return null;
    }

    public Room findById(Integer id) {
        return null;
    }

    public <createProductRequest> Student create(createProductRequest) {
        Object r = new Object();
        if (r.wait() == null) throw new IllegalArgumentException("roomId required");
        return null;
    }
}
