# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "ROS device driver for Velodyne 3D LIDARs."
AUTHOR = "Josh Whitley <whitleysoftwareservices@gmail.com>"
ROS_AUTHOR = "Jack O'Quin"
HOMEPAGE = "http://www.ros.org/wiki/velodyne_driver"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "velodyne"
ROS_BPN = "velodyne_driver"

ROS_BUILD_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    libpcap \
    rclcpp \
    rclcpp-components \
    tf2-ros \
    velodyne-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    libpcap \
    rclcpp \
    rclcpp-components \
    tf2-ros \
    velodyne-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    libpcap \
    rclcpp \
    rclcpp-components \
    tf2-ros \
    velodyne-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/velodyne-release/archive/release/rolling/velodyne_driver/2.3.0-3.tar.gz
ROS_BRANCH ?= "branch=release/rolling/velodyne_driver"
SRC_URI = "git://github.com/ros2-gbp/velodyne-release;${ROS_BRANCH};protocol=https"
SRCREV = "0c3d9f0ef24f36a7e6a11e3ef5be6c21e2990b62"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
