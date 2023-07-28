package flavioSpringBootData.DAO;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flavioSpringBootData.entities.Booking;
import flavioSpringBootData.entities.Building;

@Repository
public interface BookingRepository extends JpaRepository<Booking, UUID> {

}
