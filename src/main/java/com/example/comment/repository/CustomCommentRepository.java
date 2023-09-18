package com.example.comment.repository;

import com.example.comment.domain.request.UserUpdateRequest;

public interface CustomCommentRepository {
    void updateMemberInAlbum(UserUpdateRequest UserUpdateRequest, Long memberId);
}
