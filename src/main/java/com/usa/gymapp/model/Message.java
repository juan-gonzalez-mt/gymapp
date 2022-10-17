package com.usa.gymapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "message")
@NoArgsConstructor
@Getter
@Setter
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;

    @ManyToOne
    @JoinColumn(name = "idMachine")
    @JsonIgnoreProperties({"messages", "client", "reservations"})
    private Machine machine;

    @ManyToOne
    @JoinColumn(name = "idClient")
    @JsonIgnoreProperties({"messages", "client", "reservations"})
    private Client client;
}
