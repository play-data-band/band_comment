package com.example.comment.repository;

import com.example.comment.domain.request.UserUpdateRequest;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomCommentRepositoryImpl implements CustomCommentRepository {
    private final JPAQueryFactory queryFactory;
    private QComment qComment = QComment.comment;
    @Override
    public void updateMemberInAlbum(UserUpdateRequest UserUpdateRequest, Long memberId) {
        JPAUpdateClause updateClause = queryFactory.update(qComment);
        if(UserUpdateRequest.getMemberImage() != null){
            updateClause.set(qComment.memberImgPath, UserUpdateRequest.getMemberImage());
        }

        if(UserUpdateRequest.getMemberName() != null){
            updateClause.set(qComment.memberName, UserUpdateRequest.getMemberName());
        }

        BooleanExpression whereCondition = qComment.memberId.eq(memberID);
        updateClause.where(whereCondition);
        updateClause.execute();
    }
}
