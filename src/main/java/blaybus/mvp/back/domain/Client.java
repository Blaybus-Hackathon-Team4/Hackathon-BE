package blaybus.mvp.back.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDate;

@Entity
@RequiredArgsConstructor
@Getter
@DynamicUpdate
@Table(name = "clients", schema = "test")
public class Client {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false, length = 20)
    private String userId;

    @Column(name = "password")
    private String password;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "birth")
    private LocalDate birth;

    @ColumnDefault("'0'")
    @Column(name = "role", nullable = false, length = 100)
    private String role;

    @Column(name = "address")
    private String address;

    @Column(name = "email", nullable = false)
    private String email;

    @Builder
    public Client(String userId, String password, String name, String role, String address, String email) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.role = role;
        this.address = address;
        this.email = email;
    }
}