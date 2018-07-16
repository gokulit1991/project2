/**
 * friend controller js
 */
myModule.controller("FriendController", function($scope, $http, $rootScope, $location)
		{
			$scope.user={'loginname':'','passwoprd':'','username':'','emailid':'','mobile':'', 'role':'', 'status':''};
			$scope.friend={'friendId':'','loginname':'', 'friendloginname':'', 'status':'' };
			$scope.showFriendList;
			$scope.showSuggestedFriends;
			$scope.showPendingFriendRequests;
			
			function showFriendList()
				{console.log($rootScope.currentUser);
				$http.get('http://localhost:8085/project2Middleware/showFriendList/'+$rootScope.currentUser.loginname)
				.then(function(response)
						{
						$scope.showFriendList=response.data;
						console.log('friendlist',response.data);
						});
				};
			function showSuggestedFriends()
			{
			$http.get('http://localhost:8085/project2Middleware/showSuggestedFriends/'+$rootScope.currentUser.loginname)
			.then(function(response)
					{
					$scope.showSuggestedFriends=response.data;
					});
			
			};
			function showPendingFriendRequests()
			{
			$http.get('http://localhost:8085/project2Middleware/showPendingFriendRequests/'+$rootScope.currentUser.loginname)
			.then(function(response)
					{
					$scope.showPendingFriendRequests=response.data;
					});
			};
			
			showFriendList();
			showSuggestedFriends();
			showPendingFriendRequests();
		});
