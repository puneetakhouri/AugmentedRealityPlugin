
var augReality = {
	createEvent: function(successCallback, errorCallback) {
		cordova.exec(
			successCallback,
			errorCallback,
			'AugRealityPlugin',
			'invokePhone',
			[]
		);
	}
}