package me.minkh.demo.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MemberTest {

    @Test
    void test() {
        Member member = new Member("홍길동", 20);
        assertThat(member).isNotNull();
    }

    @Test
    void test_fail() {
        Member member = new Member("홍길동", 20);
        assertThat(member).isNull();
    }

}