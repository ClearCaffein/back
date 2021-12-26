package com.didcenter.clearcaffeine.user.repo;

import com.didcenter.clearcaffeine.user.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class UserRepositoryTest {

    private UserRepository userRepository;

    @Before
    public void setUp() throws Exception {
        userRepository = new MemoryUserRepo();
    }

    @After
    public void tearDown() throws Exception {
        userRepository = null;
    }

    @Test
    @DisplayName("입력한 유저는 조회하면 User객체를 반환합니다.")
    public void inputUser(){
        User userA = new User(1L, "UserA");

        userRepository.join(userA);

        User foundUser = userRepository.find(1L);

        assertThat(foundUser).isInstanceOf(User.class);
    }

    @Test
    @DisplayName("중복된 유저를 입력하면 null을 반환합니다.")
    public void inputExistentUser(){
        User user = new User(1L, "UserA");
        User userEx = new User(1L, "UserA");
        userRepository.join(user);

        User foundUser = userRepository.join(userEx);

        assertThat(foundUser).isNull();
    }
    @Test
    @DisplayName("유저가 입력되면 해당 유저를 id로 조회 하여 User를 반환합니다.")
    public void searchById(){
        User userA = new User(1L, "UserA");

        userRepository.join(userA);

        User foundUser = userRepository.find(1L);

        assertThat(foundUser).isEqualTo(userA);
    }



    @Test
    @DisplayName("유저가 입력되면 해당 유저를 이름으로 조회 하여 User를 반환합니다.")
    public void searchByName(){
        User userA = new User(1L, "UserA");

        userRepository.join(userA);

        User foundUser = userRepository.find("UserA");

        assertThat(foundUser).isEqualTo(userA);
    }

    @Test
    @DisplayName("존재하지 않는 유저를 조회하면 null을 반환합니다.")
    public void searchingNonExistentUser(){
        User foundUser = userRepository.find("UserA");

        assertThat(foundUser).isNull();
    }




    @Test
    @DisplayName("이미 있는 유저를 삭제하면, 유저가 삭제되고 true를 반환합니다.")
    public void deleteUser(){
        User userA = new User(1L, "UserA");

        userRepository.join(userA);

        Boolean isDeleted = userRepository.delete(1L);

        assertThat(isDeleted).isTrue();
    }

    @Test
    @DisplayName("없는 유저를 삭제하려고 하면 false가 반환됩니다.")
    public void deleteNonExistentUser(){
        Boolean isDeleted = userRepository.delete(1L);

        assertThat(isDeleted).isFalse();
    }
}