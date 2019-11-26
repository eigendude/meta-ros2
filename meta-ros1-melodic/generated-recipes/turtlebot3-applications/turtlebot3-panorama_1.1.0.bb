# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This app utilises pano_ros for taking snapshots and stitching them together to create panorama pictures."
AUTHOR = "Pyo <pyo@robotis.com>"
ROS_AUTHOR = "Younghun Ju"
HOMEPAGE = "http://wiki.ros.org/turtlebot3_panorama"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "turtlebot3_applications"
ROS_BPN = "turtlebot3_panorama"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    cv-bridge \
    geometry-msgs \
    image-transport \
    libeigen \
    nav-msgs \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    turtlebot3-applications-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cmake-modules \
    cv-bridge \
    geometry-msgs \
    image-transport \
    libeigen \
    nav-msgs \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    turtlebot3-applications-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cmake-modules \
    cv-bridge \
    geometry-msgs \
    image-transport \
    libeigen \
    nav-msgs \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    turtlebot3-applications-msgs \
    turtlebot3-bringup \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ROBOTIS-GIT-release/turtlebot3_applications-release/archive/release/melodic/turtlebot3_panorama/1.1.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/turtlebot3_panorama"
SRC_URI = "git://github.com/ROBOTIS-GIT-release/turtlebot3_applications-release;${ROS_BRANCH};protocol=https"
SRCREV = "e872c946c4438680caeb42f60cf14d5194e8ee6a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
