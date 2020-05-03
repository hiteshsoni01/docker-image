package hitesh.com.quiz.repository;


import hitesh.com.quiz.entity.Options;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionsRepository extends JpaRepository<Options, Integer> {

}
