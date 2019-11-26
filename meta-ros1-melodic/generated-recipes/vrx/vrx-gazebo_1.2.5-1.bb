# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The ROS package for the RobotX competition running in Gazebo."
AUTHOR = "Carlos Aguero <caguero@osrfoundation.org>"
ROS_AUTHOR = "Brian Bingham <briansbingham@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/vrx_gazebo"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "vrx"
ROS_BPN = "vrx_gazebo"

ROS_BUILD_DEPENDS = " \
    gazebo-ros \
    gazebo-rosdev \
    geographic-msgs \
    joy \
    joy-teleop \
    message-runtime \
    std-msgs \
    wamv-gazebo \
    wave-gazebo \
    xacro \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    protobuf-native \
"

ROS_EXPORT_DEPENDS = " \
    gazebo-ros \
    gazebo-rosdev \
    geographic-msgs \
    joy \
    joy-teleop \
    message-runtime \
    std-msgs \
    wamv-gazebo \
    wave-gazebo \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-ros \
    gazebo-rosdev \
    geographic-msgs \
    joy \
    joy-teleop \
    message-runtime \
    std-msgs \
    wamv-gazebo \
    wave-gazebo \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/vrx-release/archive/release/melodic/vrx_gazebo/1.2.5-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/vrx_gazebo"
SRC_URI = "git://github.com/ros-gbp/vrx-release;${ROS_BRANCH};protocol=https"
SRCREV = "509a957415a0be916057af1b56effe39c7280e71"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
