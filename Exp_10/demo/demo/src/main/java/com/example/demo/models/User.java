package com.example.demo.models;


import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column (name="user_id")
        private Integer id=null;

        @Column(nullable = false, unique = true)
        private String userName;
        public User(String userName) {
            super();
// The ID is Auto-generated.
            this.userName = userName;
        }
        public User() {
            super();
// TODO Auto-generated constructor stub
        }
        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
        public String getUserName() {
            return userName;
        }
        public void setUserName(String userName) {
            this.userName = userName;
        }

}
