let scene, camera, renderer, cube;

const SPEED = 0.01;

function init() {
    scene = new THREE.Scene();
    scene.background = new THREE.Color( 0xe0e0e0 );

    initCube();
    initCamera();
    initRenderer();
}

function initCube() {
  cube = new THREE.Mesh(new THREE.BoxGeometry(2, 2, 2), new THREE.MeshNormalMaterial());
  scene.add(cube);
}

function initCamera() {
    camera = new THREE.PerspectiveCamera(70, window.innerWidth / window.innerHeight, 1, 10);
    camera.position.set(0, 3.5, 5);
    camera.lookAt(scene.position);
}

function initRenderer() {
    renderer = new THREE.WebGLRenderer({ antialias: true });
    renderer.setPixelRatio( window.devicePixelRatio );
    renderer.setSize( window.innerWidth, window.innerHeight );
    document.body.appendChild( renderer.domElement );
}

function rotateCube() {
    cube.rotation.x -= SPEED * 2;
    cube.rotation.y -= SPEED;
    cube.rotation.z -= SPEED * 3;
}

function render() {
    requestAnimationFrame(render);
    rotateCube();
    renderer.render(scene, camera);
}

init();
render();
