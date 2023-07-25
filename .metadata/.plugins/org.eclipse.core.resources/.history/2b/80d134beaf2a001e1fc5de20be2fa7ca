package com.example.demo.entity;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;


@Entity
@Table(name="user")
public class User implements Serializable{
    private static final long serialVersionUID = 1L;


        /** 性別の列挙 **/
        public static enum Gender{
                male, female
        }

        /** ID */
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Integer id;

        /** 名前 */
        @Column(length=20, nullable=false)
        @NotEmpty
        @Length(max=20)
        private String name;

        /** 性別 */
        @Column(length=2)
        @Enumerated(EnumType.STRING)
        private Gender gender;

        /** 年齢 */
        @Min(value=0)
        private Integer age;

        /** メールアドレス */
        @Column(length=50)
        @Email
        @Length(max=50)
        private String email;

        /** 認証エンティティと関連定義 */
        @OneToOne(mappedBy="user")
        private Authentication authentication;

        public Integer getId() {
                return id;
        }
        public void setId(Integer id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Gender getGender() {
                return gender;
        }

        public void setGender(Gender gender) {
                this.gender = gender;
        }

        public Integer getAge() {
                return age;
        }

        public void setAge(Integer age) {
                this.age = age;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }
        public Authentication getAuthentication() {
            return authentication;
    }

    public void setAuthentication(Authentication authentication) {
            this.authentication = authentication;
    }
}