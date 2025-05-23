package com.message.aws.core.model.dto;

import com.message.aws.core.model.enums.VideoStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DTOTest {

    @Test
    void testUserVideosDTO_AllFields() {
        UserVideosDTO userVideosDTO = new UserVideosDTO(1L, VideoStatus.COMPLETED, "https://example.com/video.mp4", 100L);

        assertEquals(1L, userVideosDTO.getId());
        assertEquals(VideoStatus.COMPLETED, userVideosDTO.getVideoStatus());
        assertEquals("https://example.com/video.mp4", userVideosDTO.getVideoKey());
        assertEquals(100L, userVideosDTO.getUserId());
    }

//    @Test
//    void testUserVideosDTO_SettersAndGetters() {
//        UserVideosDTO userVideosDTO = new UserVideosDTO();
//        userVideosDTO.setId(2L);
//        userVideosDTO.setVideoStatus(VideoStatus.IN_PROGRESS);
//        userVideosDTO.setVideoKey("https://example.com/processing.mp4");
//        userVideosDTO.setVideoKey("processing.mp4");
//        userVideosDTO.setUserId(200L);
//
//        assertEquals(2L, userVideosDTO.getId());
//        assertEquals(VideoStatus.IN_PROGRESS, userVideosDTO.getVideoStatus());
//        assertEquals("https://example.com/processing.mp4", userVideosDTO.getVideoKey());
//        assertEquals("processing.mp4", userVideosDTO.getVideoKey());
//        assertEquals(200L, userVideosDTO.getUserId());
//    }

    @Test
    void testUserDTO_AllFields() {
        UserDTO userDTO = new UserDTO(3L, "Maria Silva", "maria.silva@example.com");

        assertEquals(3L, userDTO.getId());
        assertEquals("Maria Silva", userDTO.getUsername());
        assertEquals("maria.silva@example.com", userDTO.getEmail());
    }

    @Test
    void testUserDTO_SettersAndGetters() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(4L);
        userDTO.setUsername("Carlos Souza");
        userDTO.setEmail("carlos.souza@example.com");

        assertEquals(4L, userDTO.getId());
        assertEquals("Carlos Souza", userDTO.getUsername());
        assertEquals("carlos.souza@example.com", userDTO.getEmail());
    }

    @Test
    void testUserVideosDTO_EqualityAndHashCode() {
        UserVideosDTO dto1 = new UserVideosDTO(5L, VideoStatus.PROCESSING_ERROR, "https://example.com/error.mp4", 500L);
        UserVideosDTO dto2 = new UserVideosDTO(5L, VideoStatus.PROCESSING_ERROR, "https://example.com/error.mp4", 500L);

        assertEquals(dto1, dto2);
        assertEquals(dto1.hashCode(), dto2.hashCode());
    }

    @Test
    void testUserDTO_EqualityAndHashCode() {
        UserDTO dto1 = new UserDTO(6L, "Ana Paula", "ana.paula@example.com");
        UserDTO dto2 = new UserDTO(6L, "Ana Paula", "ana.paula@example.com");

        assertEquals(dto1, dto2);
        assertEquals(dto1.hashCode(), dto2.hashCode());
    }
}
