package com.niit.project2Backend;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.FriendDao;
import com.niit.model.Friend;

public class FriendDaoTest 
{
	static FriendDao friendDao;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		friendDao=(FriendDao)context.getBean("friendDao");
	}
	@Ignore
	@Test
	public void showFriendList() {
		List<Friend> friendList=friendDao.showFriendlist("vi");
		assertTrue("problem in listing friends", friendList.size()>0);
		for(Friend friend: friendList) {
			System.out.print(friend.getLoginname()+":");

			System.out.println(friend.getFriendloginname());
		}
	}
	
	@Ignore
	@Test
	public void sendFriendRequest() {
		Friend friend =new Friend();
		friend.setLoginname("");
		friend.setFriendloginname("");
		friend.setStatus("A");
		
		assertTrue("problem in sending friend request", friendDao.sendFrienRequest(friend));
	}
	@Ignore
	@Test
	public void acceptFriendRequest()
	{
		assertTrue("problem in sending friend request", friendDao.acceptFrienRequest(2200));
	}
	@Ignore
	@Test
	public void deleteFriendRequest()
	{
		assertTrue("problem in sending friend request", friendDao.deleteFrienRequest(150));
	}
	@Ignore
	@Test
	public void showPendingFriendRequests() {
		List<Friend> listPendingFriendRequests=friendDao.showPendingFriendRequests("");
		assertTrue("problem in listing pendingfriend request", listPendingFriendRequests.size()>0);
		for(Friend friend:listPendingFriendRequests) {
			System.out.print(friend.getLoginname()+":");
			System.out.print(friend.getFriendloginname());
			
		}

	}

}
