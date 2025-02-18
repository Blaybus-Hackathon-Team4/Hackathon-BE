package blaybus.mvp.back.repository;

import blaybus.mvp.back.domain.Designer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DesignerRepository extends JpaRepository<Designer, Long> {

    Optional<Designer> findByDesignerId(Long aLong);

    boolean existsByDesignerId(Long designerId);

    void deleteByDesignerId(Long aLong);
}
