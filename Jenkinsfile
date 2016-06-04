node('docker'){
	stage 'Checkout'
	checkout scm

	stage 'Build node image'
	docker.build('node')
}
