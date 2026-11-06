package ie.atu.sample.repository;

import ie.atu.sample.model.Student;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository <T extends Student> {
    @Query(value = "SELECT s FROM Student s WHERE LOWER(s.name) = LOWER(:name) ORDER BY s.name ASC")
    T findByName(String name);
    List<T> findAll();

    @Query(value = "SELECT s FROM Student s JOIN s.room r WHERE LOWER(r.name) = LOWER(:name) ORDER BY s.name ASC")
    List<T> findByRoomName(String name);
    T findById(int id);
    T save(T student);
    void delete(T student);
}
