DESCRIPTION = "cv_camera uses OpenCV capture object to capture camera image. This supports camera_image and nodelet."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "opencv image-transport roscpp cv-bridge sensor-msgs nodelet camera-info-manager roslint"

SRC_URI = "https://github.com/OTL/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "180e25756f167a5456e7cc7f8cee87af"
SRC_URI[sha256sum] = "7f4f3c80dc929d06b42ed4e859deb48d7cb546894f8096f8d7f0fdc76eed2920"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
